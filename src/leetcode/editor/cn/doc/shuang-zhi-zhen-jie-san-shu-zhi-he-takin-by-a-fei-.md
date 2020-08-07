![kudu-4690056_640.png](https://pic.leetcode-cn.com/811765f60d851b2d11b3b3a84530484803e0e0271479bb7e6c4bfa65a6cbda8f-kudu-4690056_640.png)


![image-20200806210358818.png](https://pic.leetcode-cn.com/4025cce385c3b33590d712b2a7ce59890179a9b1895b1c0a0a27a9d8b0875427-image-20200806210358818.png)




![image-20200806204740759.png](https://pic.leetcode-cn.com/07fb8429baaa54e23cc1770771200ca288b93e85e9b53eda60da1f35ae96403e-image-20200806204740759.png)





- 先将*nums*排序
- 三个指针变量，*i* 指向数组的最左侧，初始化时为*0*位置，*r*指向数组的最右侧，初始化时为*n-1*的位置，*l*指针指向*i+1*为位置
- 要求*sum*= *nums[i]*+*nums[l]*+*nums[r]*=*0*
- *nums[l]*>*0*说明*l*，*i*,*r*三个位置的数都大于*0*，结果不可能为*0*，结束，返回
  - *sum*<*0*时，说明，总和小了，*l*++
  - *sum*>*0*s时，说明总和大了，*r*--
- 去重：
  - 当*i*与前一个*i-1*的值相同，跳过
  - 当*sum=0*,*l+1* 与前前一个*l*的值相同，跳过
  - 当*sum=0*,*r-1*与后一个*r*的值相同，跳过

```java
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length < 3) return results;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l + 1] == nums[l]) l++;
                    while (l < r && nums[r - 1] == nums[r]) r--;
                    l++;
                    r--;
                } else if (sum < 0) l++;
                else if (sum > 0) r--;
            }
        }
        return results;
    }
```




## 推荐阅读


| 题号 | 链接                                                         | 备注 |
| ---- | ------------------------------------------------------------ | ---- |
| 141  | [Step1.双指针之快慢指针(科普文)](https://leetcode-cn.com/problems/linked-list-cycle/solution/step1shuang-zhi-zhen-zhi-kuai-man-zhi-zhen-ke-pu-w/) |      |
| 415  | [双指针解字符串相加[Tibetan Antelope]](https://leetcode-cn.com/problems/add-strings/solution/shuang-zhi-zhen-jie-zi-fu-chuan-xiang-jia-tibetan-/) |      |
| 2/445  | [ 双指针解两数相加[Saiga Antelope]](https://leetcode-cn.com/problems/add-two-numbers-ii/solution/shuang-zhi-zhen-jie-liang-shu-xiang-jia-saiga-ante/) |      |
| 15  | [双指针解三数之和[Takin]](https://leetcode-cn.com/problems/3sum/solution/shuang-zhi-zhen-jie-san-shu-zhi-he-takin-by-a-fei-/) |      |
| 18/454  | [双指针解四数之和[Topi]](https://leetcode-cn.com/problems/4sum-ii/solution/shuang-zhi-zhen-jie-si-shu-zhi-he-topi-by-a-fei-8/) |      |




---

#### **更多内容，欢迎订阅**
- **微信公众号:阿飞算法**
- **博客**：[**forloop.top**](http://forloop.top)
- **github:[geek-algorithm-leetcode](https://github.com/wat1r/geek-algorithm-leetcode)**
![qrcode_for_gh_76cb721bf802_258.jpg](https://pic.leetcode-cn.com/1efb09949e376b9cd1662efee85650d04c96dbf7a24985ce7d5cd75b5c3e3c7f-qrcode_for_gh_76cb721bf802_258.jpg)



