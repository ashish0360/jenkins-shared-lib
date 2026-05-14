def call(){
  echo "This is deploying code"
  sh "docker compose down && docker compose up -d"
}
