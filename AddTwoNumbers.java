class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode linListLowla, ListNode linListTania) {
        //[2,4,3]
        //[5,6,4]
        ListNode linListProvisoir = new ListNode(0);
        //linkedListProvisoir =>[0]
        ListNode current = linListProvisoir;
        //current = linkedListProvisoir =>[0]
        int ihtifad = 0;
        //ihtifad = 0
        while (linListLowla != null || linListTania != null || ihtifad != 0) {
            int lmajmoua = ihtifad;
            //1- lmajmoua =0
            if (linListLowla != null) {
                lmajmoua += linListLowla.val;
                //lmajmoua + valeurLowla(linListLowla) : 0 + 2
                //lmajmoua = 2
                linListLowla = linListLowla.next;
                //linListLowla = [4]
            }
            if (linListTania != null) {
                lmajmoua += linListTania.val;
                //lmajmoua = 2+ valeurTania(linListTania) : 2 + 5
                //lmajmoua = 7
                linListTania = linListTania.next;
                //linListTania = [6]
            }
            ihtifad = lmajmoua / 10;
            //ihtifad = 7 / 10 = 0 (int)
            int lwahadat = lmajmoua % 10;
            //lwahadat = 7 % 10 = 7

            current.next = new ListNode(lwahadat);
            current = current.next;
        }
        return linListProvisoir.next;
    }
}