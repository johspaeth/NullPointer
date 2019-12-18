pipeline {
    agent any

    tools {
         jdk 'Oracle JDK 8'
         maven 'Maven 3.6.2'
    }

    stages {

          stage('Build') {
               steps {
                    sh 'mvn clean verify -DskipTests'
                }
            }

     }
     post {
        always {
            recordIssues enabledForFailure: true, tool: codeShield(pattern: '**/target/codeshield-result-sarif.json')
        }
    }
}