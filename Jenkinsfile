pipeline {
    agent any    
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
    }
}
