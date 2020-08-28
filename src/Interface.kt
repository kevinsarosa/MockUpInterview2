interface Interface {
    interface View{
        fun scoreResult(playerScore:Int, computerScore: Int)
    }
    interface Presenter{
        fun process(playerChoice: Int, computerChoice:Int, randomNumber:Int)
    }

}