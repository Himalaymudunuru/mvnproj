
pipeline {
    agent any

    tools {
        
        maven "mvn"
    }
      
    stages {
        stage('Build') {
            steps {
              
                git 'https://github.com/YB-2009/mvnproj.git'

                
                sh "mvn -Dmaven.test.failure.ignore=true clean package install"

              
            

            
            }
        }
    stage (deploy){
        steps {
            
            sh "sudo cp /var/lib/jenkins/.m2/repository/honey/ansible/1.03/ansible-1.03.war /var/lib/tomcat8/webapps/"
        }
    }
    
    
      }
 
    }
