pipeline {
  agent any
  stages {
    stage('Git Persistence') {
      steps {
        git(url: 'http://gitlab.eurofragance.local:9030/efragance/efragance-persistence.git', branch: 'develop_temp', credentialsId: 'GIT')
      }
    }

  }
}