class MainPresenter(var view: Interface.View) : Interface.Presenter {
    var result = 1
    var playerScore = 0
    var computerScore = 0


    override fun process(playerChoice: Int, computerChoice: Int, randomNumber: Int) {

        var selisihPlayer = 0
        var selisihCom = 0

        if (playerChoice > randomNumber){
            selisihPlayer = playerChoice-randomNumber
        }else if (randomNumber> playerChoice){
            selisihPlayer = randomNumber-playerChoice
        }

        if (computerChoice>randomNumber){
            selisihCom = computerChoice-randomNumber
        }else if(randomNumber> computerChoice){
            selisihCom = randomNumber-computerChoice
        }


        when {
            selisihCom<selisihPlayer -> {
                result = 1
                println("Computer Win")
            }
            selisihPlayer<selisihCom -> {
                result = 2
                println("Player Win")
            }
            else -> {
                result = 3
                println("Draw")
            }
        }

        if (result == 2) {
            ++playerScore
        } else if (result == 1) {
            ++computerScore
        }
        view.scoreResult(playerScore,computerScore)
    }
}