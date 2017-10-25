
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/helloworld/conf/routes
// @DATE:Wed Oct 25 11:55:46 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
