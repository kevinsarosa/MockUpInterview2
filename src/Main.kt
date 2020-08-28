class Main {

    companion object : Interface.View {
        private var playerName = ""
        private var playerChoice = 0
        private var computerChoice = 0
        private var playerScore = 0
        private var computerScore = 0
        private var user = mutableListOf<User>()
        private var presenter = MainPresenter(this)


        @JvmStatic
        fun main(args: Array<String>) {
            println("Masukan nama pemain:")
            playerName = readLine().toString()
            println("Hallo $playerName")
            for (i in 0..2) {
                playGuess()
            }
            println("hasil pertandingannya adalah pemain $playerScore, dan komputer $computerScore")
        }

        fun playGuess() {
            println("Pilih angka dari 0-9")
            playerChoice = readLine()!!.toInt()
            println("kamu memilih $playerChoice")
            println("Komputer memilih...")
            computerChoice = (0..9).random()
            println("Komputer memilih $computerChoice")
            val randomNumber = (0..9).random()
            println("Angka yang muncul adalah $randomNumber")
            presenter.process(playerChoice, computerChoice, randomNumber)

        }

        override fun scoreResult(playerScore: Int, computerScore: Int) {
            this.playerScore = playerScore
            this.computerScore = computerScore
        }
    }


}