<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Signin Template for Bootstrap</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="static/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="static/css/theme.css" rel="stylesheet">
    <link href="static/css/index.css" rel="stylesheet">
    <script src="static/js/ie-emulation-modes-warning.js"></script>
    <script>window.jQuery || document.write('<script src="static/js/dist/jquery.min.js"><\/script>')</script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/docs.min.js"></script>
    <script src="static/js/ie10-viewport-bug-workaround.js"></script>
</head>
<body>
<%--搜索框--%>
<%--<div class="u-hidden-down@tablet u-ml-xxs">
    <div class="c-field has-icon-right c-navbar__search">
            <span class="c-field__icon">
                <i class="fa fa-search"></i>
            </span>
        <label class="u-hidden-visually" for="navbar-search">Seach</label>
        <input class="c-input" id="navbar-search" type="text" placeholder="Search">
    </div>
</div>--%>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img data-src="holder.js/1140x300/auto/#777:#555/text:First slide" alt="First slide" src="img/3.jpg">
                </div>
                <div class="item">
                    <img data-src="holder.js/1140x300/auto/#666:#444/text:Second slide" alt="Second slide" src="img/4.jpg">

                </div>
                <div class="item">
                    <img data-src="holder.js/1140x300/auto/#555:#333/text:Third slide" alt="Third slide" src="img/2.jpg">
                </div>
            </div>
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
            </div>
        </div>
        <div class="col-md-1"></div>
    </div>
    <div class="row">
        <div class="col-md-12" style="border-radius: 8px;box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);margin-top: 100px;padding-left: 10px;padding-right: 10px">
            <div class="container-fluid">
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/4.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/3.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/2.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/1.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/5.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/6.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/7.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/8.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/9.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/10.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/11.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/12.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/13.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/14.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/15.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/16.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/17.jpg" alt="1"></div>
                <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2 im"><img src="list/18.jpg" alt="1"></div>
            </div>
        </div>
    </div>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
