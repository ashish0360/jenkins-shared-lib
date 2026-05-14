def call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    echo "This is pushing image to docker hub repo"
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker image tag ${env.dockerhubuser}/${Project}:${ImagTag}
    sh "docker push ${dockerHubUSer}/${Project}:${ImageTag}"
        }
    } 
}
