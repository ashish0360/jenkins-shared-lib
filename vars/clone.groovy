def call(String url, String branch){
  echo "This is clonig the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning is successfull"
}
