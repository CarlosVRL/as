pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package -DskipTests=true"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}