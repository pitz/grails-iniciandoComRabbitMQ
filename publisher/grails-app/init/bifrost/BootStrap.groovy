package bifrost

class BootStrap {

    def init = { servletContext ->
        println "   _____ _ ___             _     "
        println "  | __  |_|  _|___ ___ ___| |_   "
        println "  | __ -| |  _|  _| . |_ -|  _|  "
        println "  |_____|_|_| |_| |___|___|_|    "
        println "                                  v0.1 "
    }
    def destroy = {
    }
}
