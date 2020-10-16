package Add_Two_Numbers;
public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode l4=l3;
        boolean isOver10=false;
        while(l1!=null&&l2!=null){
            int sum;
            if(isOver10)
                sum=l1.val+l2.val+1;
            else
                sum=l1.val+l2.val;

            if(sum>=10){
                isOver10=true;
                l3.val=sum-10;
            }
            else{
                isOver10=false;
                l3.val=sum;
            }
            l1=l1.next;
            l2=l2.next;
            System.out.println(l3.val);
            if(isOver10||l1!=null||l2!=null){//这里逻辑不要搞混了,另外这一步的逻辑很关键,忽略了ListNode的一个构造函数
                l3.next=new ListNode();//用好构造函数
                l3=l3.next;
            }
        }
        if(isOver10){
            if(l1!=null&&l2==null){
                while(l1!=null){
                    int sum;
                    if(isOver10)
                        sum=1+ l1.val;
                    else
                        sum=l1.val;

                    if(sum>=10){
                        isOver10=true;
                        l3.val=sum-10;
                    }
                    else{
                        isOver10=false;
                        l3.val=sum;
                    }
                    System.out.println(l3.val);
                    l1=l1.next;//这一步缺失
                    if(isOver10||l1!=null) {
                        l3.next = new ListNode(0);
                        l3 = l3.next;
                    }
                }
                if (isOver10&&l1==null) {
                    l3.val = 1;
                }
            }
            else if(l2!=null&&l1==null){
                while(l2!=null){
                    int sum;
                    if(isOver10)
                        sum=1+ l2.val;
                    else
                        sum=l2.val;
                    if(sum>=10){//以前检查出来了，但是只改了上面那一个
                        isOver10=true;
                        l3.val=sum-10;
                    }
                    else{
                        isOver10=false;
                        l3.val=sum;
                    }
                    l2=l2.next;
                    if(l2!=null||isOver10) {
                        l3.next = new ListNode(0);
                        l3 = l3.next;
                    }
                }
                if(isOver10&&l2==null) {
                    l3.val = 1;
                }
            }
            else
                l3.val=1;
        }
        else {
            if (l1!=null&&l2==null) {
//                l3=l1;
                l3.next=l1.next;//为什么上面那种赋值方式不行，而下面那种赋值方式可以呢
                l3.val=l1.val;
            }
            else if(l2!=null&&l1==null){
                l3.val=l2.val;
                l3.next=l2.next;
            }
        }
        return l4;
    }
}
