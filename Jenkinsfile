pipeline {
    agent any

    tools {
         jdk 'Oracle JDK 8'
         maven 'Maven 3.6.2'
    }

    stages {

          stage('Build') {
               steps {
                    mvn clean package -DskipTests
                }
            }

     }
}