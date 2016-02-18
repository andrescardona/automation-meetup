package api

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

/**
 * Created by fcardona on 2/18/16.
 */
class APIClient {
  def restClient = new RESTClient('http://api.icndb.com/')

  def isServerAlive() {
    return restClient.get([path: "/"]).status == 200
  }

  def getJokes() {
    return restClient.get([path: 'jokes'])
  }

  def getSpecificJoke(jokeId) {
    return restClient.get([path: "jokes/$jokeId"])
  }

  def getRandomJoke(options) {
    return restClient.get([path: 'jokes/random' ,contentType: ContentType.JSON] + options)
  }
}
