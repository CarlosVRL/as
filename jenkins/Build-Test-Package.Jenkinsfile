pipeline {
    agent any
    tools {
        maven 'apache-maven-3.0.1'
    }
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package -DskipTests=true"
            }
        }
    }
}