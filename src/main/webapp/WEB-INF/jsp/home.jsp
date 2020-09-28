<%-- 
    Document   : home
    Created on : Sep 23, 2020, 9:38:00 AM
    Author     : Laptop
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
               
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Đ&Đ Shop</title>
        <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/shop-homepage.css" rel="stylesheet" type="text/css"/>
        <script src="../../vendor/jquery/jquery.js" type="text/javascript"></script>
        </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
            <a class="navbar-brand" href="#">
                <img src="images/14.png" alt="">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search..." style="width: 380px;">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Trang chủ<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Sản phẩm
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Thời trang nam</a>
                            <a class="dropdown-item" href="#">Thời trang nữ</a>
                            <a class="dropdown-item" href="#">Thời trang trẻ em</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Khuyến mãi</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Hướng dẫn - Hỗ trợ
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Thanh toán - Giao nhận</a>
                            <a class="dropdown-item" href="#">Câu hỏi thường gặp</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Liên hệ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Đăng nhập</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="register">Đăng ký</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Giỏ hàng</a>
                    </li>
                </ul>
                
            </div>
        </nav>
        <div class="container" >
            <header>
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100" src="images/123.png" alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="images/456.jpg" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="images/789.png" alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </header>
            <h3 class="my-4">Sản phẩm bán chạy</h3>
            <div class="row">
                
            </div>
            <h3 class="my-4">Sản phẩm mới nhất</h3>
            <div class="row">
                
            </div>
            <h3 class="my-4">Sản phẩm khuyến mãi</h3>
            <div class="row">
                
            </div>
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                    <li class="page-item disabled">
                        <a class="page-link" href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
        </nav>
        </div>
        <footer class="section footer-classic context-dark bg-image" style="background: #4b88e3;">
            <div class="container">
                <div class="row row-30">
                    <div class="col-md-4">
                        <strong><span>Liên hệ với chúng tôi</span></strong>
                        <div class="textfooter">
                            <p><img alt="" src="images/dv.png" />&nbsp; 92 Quang Trung, Hải Châu, Đà Nẵng</p>
                            <p><img alt="" src="images/dd.png" />&nbsp; 097.839.3333 - 0902.79.79.79</p>
                            <p><img alt="" src="images/lt.png" />&nbsp; Đ&ĐShop.2020@gmail.com</p>
                            <p><img alt="" src="images/dh.png" />&nbsp; Thứ 2 - Thứ 7: 9:30 - 21:30</p>
                        </div>
                    </div>
                    <div class="col-xs-8">
                        <strong><span>Kết nối với chúng tôi</span></strong>
                        <div class="textfooter">
                            <p><a href="https://www.facebook.com/"><img alt="" src="images/fb.png" width="30" height="30" data-was-processed="trues"/></a></p>
                            <p><a href="https://www.instagram.com/"><img alt="" src="images/ig.png" width="30" height="30" data-was-processed="trues"/></a></p>
                            <p><a href="https://twitter.com/"><img alt="" src="images/tw.png" width="30" height="30" data-was-processed="trues"/></a></p>
                            <p><a href="https://www.youtube.com/"><img alt="" src="images/yt.png" width="30" height="30" data-was-processed="trues"/></a></p>
                        </div>
                    </div>
                </div>
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
            </div>
        </footer>
        <script src="../../vendor/jquery/jquery.min.js" type="text/javascript"></script>
        <script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </body>
</html>
