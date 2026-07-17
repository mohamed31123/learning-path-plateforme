pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'YOUR_GITHUB_REPO'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t learning-path-app .'
            }
        }
    }
}