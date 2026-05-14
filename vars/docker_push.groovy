def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    echo "This is pushing image to docker hub repo"
    sh "docker login -u ${dockerhubuser} -p ${env.dockerHubPass}"
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
        }
    }
