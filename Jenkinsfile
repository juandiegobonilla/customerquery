pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
          stage("Checkout") {
               steps {
                    git url: 'https://github.com/juandiegobonilla/customerquery.git'
               }
          }
        stage("Build"){
             steps {
                sh 'mvn -B -DskipTests clean package'                                   
            }             
        }        
    }
}
