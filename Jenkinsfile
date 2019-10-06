pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    
    stages {
          stage("Checkout") {
               steps {
                    git url: 'https://github.com/juandiegobonilla/customerquery.git'
               }
          }
         stage("Build") {
               steps {
                    sh 'mvn -B -DskipTests clean package' 
               }
     
          }
        stage("Docker"){
            steps{                
                script {
                    def customImage = docker.build("customerQuery")
                }   
            }
        }
    }
}
