using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Edge;
using System;
using System.Security.Policy;

namespace seleniumPr
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            EdgeDriver edgeDriver = new EdgeDriver();
            edgeDriver.Url = "https://yody.vn/account/register";
            edgeDriver.Navigate();

            //Tim doi tuong theo ID
            var btn = edgeDriver.FindElement(By.Id("customer_register"));
            btn.Click();
            //Họ và Tên	 first_name
            edgeDriver.FindElement(By.Id("first_name")).SendKeys("ChuNgan");
            //Số điện thoại phone
            edgeDriver.FindElement(By.Id("phone")).SendKeys("0977069028");
            //Địa chỉ email iptEmail
            edgeDriver.FindElement(By.Id("iptEmail")).SendKeys("kien.hn1@gmail.com");
            //Mật khẩu  password
            edgeDriver.FindElement(By.Id("password")).SendKeys("@abc123456");
            //Nút đăng ký  btnSubmit
            edgeDriver.FindElement(By.Id("btnSubmit")).Click();
        }

    }

}
