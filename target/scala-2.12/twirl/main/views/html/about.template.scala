
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<head>
  <title>Home</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" />
</head>

<body>
  <!-- start of nav section -->
  <nav class="navbar navbar-inverse">
    <!-- nav header/ branding -->
    <div class="navbar-header">
      <a class="navbar-brand" href="/">Lab 2</a>
    </div>
    <!-- List containing nav links -->
    <ul class="nav navbar-nav">
      <li class=""><a href="/">Home</a></li>
      <li class="active"><a href="/about">About Us</a></li>
      <li class=""><a href="/products">Products</a></li>      
    </ul>
  </nav>

  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-3">
        <h4 class="well">
            Menu
        </h4>
      </div>
      <div class="col-sm-9">
        <h4 class="well">
          """),_display_(/*34.12*/message),format.raw/*34.19*/("""
        """),format.raw/*35.9*/("""</h4>
      </div>
  </div>
    <footer class="container-fluid text-center">
      <p>Copyright 2017</p>
    </footer>
    
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 25 12:17:03 IST 2017
                  SOURCE: /home/wdd/webapps/helloworld/app/views/about.scala.html
                  HASH: 0c822846c7c1dbbab01830e26db48de5a1fa7841
                  MATRIX: 948->1|1060->18|1087->19|1958->863|1986->870|2022->879
                  LINES: 28->1|33->1|34->2|66->34|66->34|67->35
                  -- GENERATED --
              */
          