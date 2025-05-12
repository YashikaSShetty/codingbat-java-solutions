public int caughtSpeeding(int speed, boolean isBirthday) {
      int allowance = isBirthday ? 5 : 0; 
        if (speed <= 60 + allowance) {
            return 0; // no ticket
            } else if (speed <= 80 + allowance) {
                return 1; // small ticket
                } else {
                    return 2; // big ticket
                    }
                    
}