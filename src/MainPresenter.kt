class MainPresenter(var view: Interface.View) : Interface.Presenter {
    var result = 1
    var playerScore = 0
    var computerScore = 0


    override fun process(playerChoice: Int, computerChoice: Int, randomNumber: Int) {
        when {
            computerChoice == randomNumber -> {
                result = 1
                println("Computer Win")
            }
            playerChoice == randomNumber -> {
                result = 2
                println("Player Win")
            }
            else -> {
                result = 3
                println("Draw")
            }
        }

        if (result == 2) {
            playerScore += 1
        } else if (result == 3) {
            computerScore += 1
        }
        view.scoreResult(playerScore,computerScore)
    }
}