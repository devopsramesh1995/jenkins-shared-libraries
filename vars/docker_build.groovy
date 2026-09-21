def(tring ProjectName, string ImageTag, string DockerHubUser ){
  sh "docker built -t {$DockerHubUser}/{$ProjectName}:{$ImageTag} ."
}
