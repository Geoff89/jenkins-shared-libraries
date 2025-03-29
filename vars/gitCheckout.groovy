 def call(Map stageParams) {
    checkout scmGit(branches: [[name: stageParams.branch]], userRemoteConfigs: [[url: stageParams.url]]) 
 }
 
 
 
// checkout scmGit(branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Geoff89/github-jenkins.git']]) 