def call(String ProjectName, String ImageTag, String DockerHubUSer){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
