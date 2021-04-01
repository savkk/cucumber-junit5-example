pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
                allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}