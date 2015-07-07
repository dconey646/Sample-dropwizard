
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
        </div>
        
      
        <div class="col-lg-9">
         <a href="/viewBooks" class="back-link" style="padding-bottom:15px;display:inline-block;">Back to library</a>
          <div class="caption" style="padding-top:10px;">
            <h2 class="media-heading">${book.bookTitle}</h2>
             <span class="media-author">${book.author}</span>
             <br><small>${book.category} &mdash; ${book.year}</small>
             <hr>
             <#if book.available>
				<button class="btn btn-success js-btn-borrow">Borrow</button>
				<div id="borrow-form" class="row" style="margin-top:15px">
				<div class="clearfix col-lg-6">
				<form action="/borrow/${book.bookID}" method="POST">
				<div class="form-group">
				<label class="control-label" for="focusedInput">Your name</label>
				<input class="form-control" name="username" type="text" placeholder="">
				</div>
				<input type="submit" value="Borrow this book" class="btn btn-success js-btn-submit"> <button class="btn btn-default js-btn-cancel">Cancel</button>
				</form>
				</div>
			</div>
			<#else>
            </#if>
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
	<script>
$('#borrow-form').hide();
function showBorrowForm() {
$('#borrow-form').show();
$('.js-btn-borrow').hide();
}
$('.js-btn-borrow').click(showBorrowForm);
function cancelBorrowForm() {
$('#borrow-form').hide();
$('.js-btn-borrow').show();
}
$('.js-btn-cancel').click(cancelBorrowForm);
</script>

</body>
</html>

