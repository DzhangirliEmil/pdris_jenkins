pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/DzhangirliEmil/pdris_jenkins.git'
                sh "mvn -Dmaven.test.skip clean package"
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                junit '**/target/surefire-reports/TEST-*.xml'
            }

            post {
                always {
                    junit(
                        allowEmptyResults: true,
                        testResults: '**/test-results/*.xml'
                    )

                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                    ])
                }
            }
        }

        stage('Sonar') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube') {
                    script {
                        sh "mvn sonar:sonar"
                    }
                }
            }
        }

        stage('Docker image building') {
            steps {
                sh 'docker build -t demiproger/best_app .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker run -P demiproger/best_app .'
            }
        }
    }

    post {
        always {
            cleanWs deleteDirs:true
        }
    }
}
