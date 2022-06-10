package com.wiryaimd.codechallenge.leetcode;

public class MergeTwoLinkedList {

//      Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      // uncompleted
//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        ListNode listNode = new ListNode();
//        ListNode tmp = listNode;
//
//        while (true){
//            if (list2 == null){
//                tmp.next = list1;
//                break;
//            }
//
//            if (list1 == null){
//                tmp.next = list2;
//                break;
//            }
//
//            if (list1.val < list2.val){
//                tmp.next = list1;
//                list1 = list1.next;
//            }else{
//                tmp.next = list2;
//                list2 = list2.next;
//            }
//
//            tmp = tmp.next;
//        }
//
//        return listNode.next;
//    }



    // completed accepted .... hahay O n yachh
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode node = null;
        if(list1 == null && list2 == null){
            return null;
        }

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            node = list1;
            list1 = list1.next;
        }else{
            node = list2;
            list2 = list2.next;
        }

        ListNode head = node;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if(list1 == null){
            node.next = list2;
        }else{
            node.next = list1;
        }
        return head;
    }

    public static void main(String[] args) {
          ListNode listNode = new ListNode(2, null);
          ListNode listNode1 = new ListNode(4, listNode);
          ListNode listNode2 = new ListNode(5, listNode1);
          ListNode listNode3 = new ListNode(7, listNode2);
          ListNode listNode4 = new ListNode(43, listNode3);
          ListNode listNode5 = new ListNode(1, listNode4);

          ListNode blistNode = new ListNode(56, null);
          ListNode blistNode1 = new ListNode(1, blistNode);
          ListNode blistNode2 = new ListNode(3, blistNode1);
          ListNode blistNode3 = new ListNode(8, blistNode2);
          ListNode blistNode4 = new ListNode(3, blistNode3);


          ListNode res = mergeTwoLists(listNode5, blistNode4);
          while (res != null){
              System.out.println(res.val);
              res = res.next;
          }


    }
}
