pipeline {
    agent any

    environment {
        APP_NAME = 'Learning Path Platform'
        JAVA_HOME = 'C:/Program Files/Eclipse Adoptium/jdk-21.0.11.10-hotspot'
        MAVEN_HOME = 'C:/Users/lenovo/Desktop/apache-maven-3.9.12'
    }

    stages {

        stage('Environment Check') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
                bat 'git --version'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Execution des tests'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Generation du JAR'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Verify') {
            steps {
                bat 'mvn verify'
            }
        }
    }

    post {

        always {
            echo 'Le pipeline est termine !'
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'Pipeline execute avec succes'
        }

        failure {
            echo 'Pipeline echoue. Consulte les logs.'
        }
    }
}