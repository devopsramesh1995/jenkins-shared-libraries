def(tring ImageName, string ImageTag, string DockerHubUser ){
  sh "docker built -t {$DockerHubUser}/{$ImageName}:{$ImageTag} ."
}
