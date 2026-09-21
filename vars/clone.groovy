def call(string url , string branch){
  echo"this is clonnig the code"
  git url: "${url}", branch: "${branch}"
  echo "clonning is sucessfull performed"
}
