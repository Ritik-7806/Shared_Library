def call(String branch, String cred_id, String url){
  checkout([$class: 'GitSCM', branches: [[name: branch]],
            doGenerateSubmoduleConfigurations: false, extensions: [],
            submoduleCfg: [],
            userRemoteConfigs: [[credentialsId: cred_id,
                                 url: url
                                ]]])
            }
