pipeline
{
agent any
stages{
  stage('Build'){
    steps{
        sh 'mvn -f pom.xml clean package'
    }    
  }
  stage('deploy to Staging Env'){
    steps{
        build job:'Deploy_Application_Staging_Env1'
    }    
  }  

   stage('deploy to Prod Env'){
    steps{
        timeout(time:5, unit:'DAYS')
        { 
          input message:'Approve Producation Deployment?'
        }
        build job:'Deploy_Application_Prod_Env'
    }    
  }  
  
}
}
