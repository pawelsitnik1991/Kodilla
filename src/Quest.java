interface Quest {
    void process();
}

class DeadIslandQuest implements Quest {
    public void process() {
        System.out.println("Wykonaja zadanie na DeadIslandQuest");
    }
}

class EliteKnightQuest implements Quest {
    public void process() {
        System.out.println("Wykonaja zadanie na EliteKnightQuest");
    }
}

class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public static void main(String[] args) {
        Quest deadIslandQuest = new DeadIslandQuest();
        Quest eliteKnightQuest = new EliteKnightQuest();
        Knight deadIslandQuestKnight = new Knight(deadIslandQuest);
        Knight eliteKnightQuestKnight = new Knight(eliteKnightQuest);
        deadIslandQuestKnight.taskQuest();
        eliteKnightQuestKnight.taskQuest();
        deadIslandQuest.process();
        eliteKnightQuest.process();
    }

    public void taskQuest() {
        quest.process();
    }
}