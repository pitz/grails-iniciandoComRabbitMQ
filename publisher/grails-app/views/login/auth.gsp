<g:set var='securityConfig' value='${applicationContext.springSecurityService.securityConfig}'/>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div id="login" class="container">
            <div class="fluid-row inner text-center">
                <h1>bifrost</h1>
                <g:if test='${flash.message}'>
                    <div class="login_message">${flash.message}</div>
                </g:if>
                <g:form class="form-answers" controller="login" action="authenticate">
                    <fieldset class="form form-group col-xs-12 offset-lg-4 col-lg-4">
                        <ol class="property-list evaluationAnswer">
                            <li class="fieldcontain">
                                <label for="username" class="text-center">Usuário</label>
                                <input type="text" id="username" class="form-control text_" name="username" required />
                            </li>
                            <li class="fieldcontain">
                                <label for="password" class="text-center">Senha</label>
                                <input type="password" id="password" class="form-control text_" name="password" required />
                            </li>
                        </ol>
                    </fieldset>
                    <fieldset class="fluid-row">
                        <g:submitButton name="login" type="submit" class="btn bg-primary btn-primary login" value="Login" style="height: auto !important; width: auto !important" />
                    </fieldset>
                </g:form>
            </div>
        </div>
    </body>
</html>
