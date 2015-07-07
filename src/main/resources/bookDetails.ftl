
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Book</title>
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
                    <form class="navbar-form navbar-right" role="search">
                      <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                      </div>
                      <select class="form-control" id="select">
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

        <div class="col-lg-3 col-md-3 col-xs-6 training-material-container">
          <a href="http://google.com">
            <div class="productbox">
              <div class="imgthumb img-responsive training-material-image">
                <img src="http://placehold.it/100x150">
              </div>
              <h4>
              <#if book.available>
              		<span class="label label-primary">Available</span>
              	<#else>
              		<span class="label label-default">On loan</span>
              	</#if>
              </h4>
            </div>
          </a>
        </div>
        
      
        <div class="col-lg-9">
         <a href="/viewBooks" class="back-link" style="padding-bottom:15px;display:inline-block;">Back to library</a>
          <div class="caption" style="padding-top:10px;">
            <h2 class="media-heading">${book.bookTitle}</h2>
             <span class="media-author">${book.author}</span>
             <br><small>${book.category} &mdash; ${book.year}</small>
             <hr>
             <button class="btn btn-success">Borrow</button>
          </div>
        </div>

       
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
    <script src="/js/bootstrap.min.js"></script>
</body>
</html>

