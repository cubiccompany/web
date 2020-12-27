<#import "parts/common.ftl" as c>

<@c.page>

<form action="/login" method="post">


    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Почта: </label>
        <div class="col-sm-6">
            <input type="email" name="username" placeholder="Почта" class="form-control">
        </div>
    </div>

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Пароль: </label>
        <div class="col-sm-6">
            <input type="password" name="password" placeholder="Пароль" class="form-control">
        </div>
    </div>
    <button class="btn btn-primary" type="submit" >Тыкай</button>

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">У вас есть аккаунт?</label>
        <a class="nav-link" href="/registration">Зарегистрироваться</a>
    </div>



</form>
</@c.page>