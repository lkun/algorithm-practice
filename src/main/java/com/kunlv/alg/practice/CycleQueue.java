package com.kunlv.alg.practice;

/**
 * 循环队列，基于数组实现
 *
 * @program: algorithm-practice
 * @author: LK
 * @create: 2020-02-22 18:46
 **/
public class CycleQueue {
    //数组
    private String[] array;
    //队列头
    private int queueHead;
    //队列尾
    private int queueFoot;

    /**
     * 设置容量
     *
     * @param capacity 容量值
     */
    public CycleQueue(int capacity) {
        this.array = new String[capacity];
    }

    /**
     * 入队列
     *
     * @param element 入队元素
     */
    public void inQueue(String element) {
        System.out.println("队脚值：" + queueFoot);
        if ((queueFoot + 1) % array.length == queueHead) {
            System.out.println("队列已满！");
            return;
        }

        array[queueFoot] = element;
        System.out.println("入队元素：" + element);
        queueFoot = (queueFoot + 1) % array.length;
    }

    /**
     * 出队
     */
    public void outQueue() {
        System.out.println("队头值：" + queueHead);
        if (queueFoot == queueHead) {
            System.out.println("队列已空！");
            return;
        }
        String queueElement = array[queueHead];
        System.out.println("出队元素：" + queueElement);
//        array[queueHead] = "";
        queueHead = (queueHead + 1) % array.length;
    }

    public void getQueueElement() {
        for (int i = queueHead; i != queueFoot; i = (i + 1) % array.length) {
            System.out.println("队列中元素：" + array[i]);
        }
    }

    public static void main(String[] args) {
        CycleQueue cycleQueue = new CycleQueue(8);
        cycleQueue.inQueue("0");
        cycleQueue.inQueue("1");
        cycleQueue.inQueue("2");
        cycleQueue.inQueue("3");
        cycleQueue.inQueue("4");
        cycleQueue.inQueue("5");
        cycleQueue.inQueue("6");
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.inQueue("7");
        cycleQueue.inQueue("8");
        cycleQueue.inQueue("9");
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.outQueue();
        cycleQueue.inQueue("10");
        cycleQueue.inQueue("11");
        cycleQueue.getQueueElement();
    }
}
