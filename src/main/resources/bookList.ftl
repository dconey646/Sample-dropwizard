<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Story 1</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <link rel="stylesheet" href="http://xz.rs/_/bootstrap.min.css" media="screen">
  </head>
  <body>



    <div class="container">
      <div class="bs-docs-section clearfix">
        <div class="row">
          <div class="col-lg-12">


            <div class="bs-component">
              <nav class="navbar navbar-default">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">kLibrary</a>
                  </div>

                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <form class="navbar-form navbar-right" role="search" method="POST" action="search-books">
                      <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search" name="SearchString">
                      </div>
                      <select class="form-control" id="select" name="SearchType">
                        <option>Title</option>
                        <option>Author</option>
                        <option>Category</option>
                      </select>
                      <button type="submit" class="btn btn-primary">Search</button>
                    </form>
                  </div>
                </div>
              </nav>
            </div>

            <!-- /example -->

          </div>
        </div>
      </div>

      <div class="row">
        <!-- All the books and stuff -->
        
        <#list books as book>
		
        <div class="col-lg-3 col-md-3 col-xs-6 training-material-container">
          <a href="/viewBookDetails/${book.bookID}">
            <div class="productbox">
            <div class="imgthumb img-responsive training-material-image">
              <img src="http://placehold.it/100x150">
            </div>
            <div class="caption" style="padding-top:10px;">
            
              <h4 class="media-heading">${book.bookTitle} 
              	<#if book.available>
              		<span class="label label-primary">Available</span>
              	<#else>
              		<span class="label label-default">On loan</span>
              	</#if>
              </h4>
              
              <span class="media-author">${book.author}</span>
              
              <br><small class="text-muted">${book.category} &mdash; ${book.year} </small>
            </div>
            </div>
          </a>
        </div>
        </#list>
      </div>



      <!-- <footer>
        <div class="row">
          <div class="col-lg-12">
            <small>6/7/2015</small>
          </div>
        </div>

      </footer> -->


    </div>


    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="http://xz.rs/_/bootstrap.min.js"></script>
</body>
</html>

