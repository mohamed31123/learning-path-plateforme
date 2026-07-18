pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Compilation du projet'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo("Execution des tests")
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Generation des JAR'
                bat 'mvn clean package -DskipTests'
            }
        }


    }
}