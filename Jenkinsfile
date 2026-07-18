pipeline {
    agent any

    stages {
     environment {
            APP_NAME = 'Learning Path Platform'
            JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot'
            MAVEN_HOME = 'C:\Users\lenovo\Desktop\apache-maven-3.9.12'
        }

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