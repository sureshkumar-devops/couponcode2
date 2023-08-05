pipeline
{
agent any
triggers{ pollSCM: '* * * * *' }
stages{
  stage('Build'){
    steps{
        sh 'mvn -f pom.xml clean package'
    }    
  }
  stage('deploy to Staging Env'){
    steps{
        Build job: 'Deploy_Application_Staging_Env1
    }    
  }  
}
}
