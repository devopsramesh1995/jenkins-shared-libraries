def call(String Imagename, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(
        credentialsId: 'docker-hub-cred',
        passwordVariable: 'dockerHubPass',
        usernameVariable: 'dockerHubUser'
    )]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    sh "docker push ${dockerhubuser}/${Imagename}:${ImageTag}"
}
