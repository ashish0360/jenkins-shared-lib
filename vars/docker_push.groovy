def call(Map config){
  withCredentials([usernamePassword(credentialsId: "dockerhubcred",passwordVariable: "dockerHubPass",usernameVariable: "dockerHubUser")]){
    echo "This is pushing code to docker hub repo"
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass} "
    sh "docker push ${config.dockerhubuser}/${config.Project}:${config.ImageTag}"
  }
  echo "Image push is successfull"
}



/*def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    echo "This is pushing image to docker hub repo"
    sh "docker login -u ${dockerhubuser} -p ${env.dockerHubPass}"
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
        }
    }*/
