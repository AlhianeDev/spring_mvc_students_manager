/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-11-18 16:39:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.static_005fpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class terms_005fof_005fservice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/static_pages/../includes/footer.jspf", Long.valueOf(1700304211085L));
    _jspx_dependants.put("/WEB-INF/views/static_pages/../includes/header.jspf", Long.valueOf(1700223992671L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>Students Manager</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel = \"stylesheet\"\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/styles.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<header class=\"header\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h2 class=\"brand\"><a href=\"#\">Students Manager</a></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<section class=\"sec static-page terms-of-service\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h2 class=\"sup-title\">Terms of Service</h2>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Thank you for choosing Tasks</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Tasks Service is provided by Pocket Brilliance Limited and \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tby using the Service you are agreeing to our privacy policies and these Terms of \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tService.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Privacy Protection</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Tasks <a href=\"privacy-policy.jsp\">privacy policy</a> \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\texplains how we use your personal data and protect your privacy when using the Tasks \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tService.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Software in Our Service</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">When the Tasks Service requires or includes downloadable \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsoftware, this software may be updated automatically on your device when a new \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tversion or features are available to you.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Pocket Brilliance Limited gives you a personal, worldwide, \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\troyalty-free, non-assignable and non-exclusive license to use the software provided \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tby us as part of the Service. You may not copy, modify, distribute, sell, or lease \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tany part of our Service or included software, nor may you reverse engineer or \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tattempt to extract the source code of the software, unless local laws prohibit those \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trestrictions or you have our written permission.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Modifying and Termination of Service</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Pocket Brilliance Limited may add or remove functionality or \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfeatures at any time. We may also suspend or stop the Service at any time with at \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tleast thirty days notice.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">You can choose to stop using the Service at any time. It is \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tyour responsibility to cancel your subscription as this must be done by the end user \t\t\t\t\r\n");
      out.write("\t\t\tand cannnot be done by Tasks support.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Using the Service</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">You must follow any policies made available to you within \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tthe Service. You may only use our Service as permitted by law. Pocket Brilliance \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tLimited may investigate and/or suspend or terminate our Service to you at any time \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif we find your use of our Service violates the Terms and/or any policies.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Using our Service does not grant you any ownership of any \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tintellectual property rights in our Service or the content you may have access to. \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tYou may not use any copyrighted content in our Service unless you have permission \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfrom the content owner.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">You must not abuse and or misuse our Service in any way. \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tThis includes but is not limited to:</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<ul class=\"part-list\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>Using the Service for any unlawful purposes or activities</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>Accessing or tampering with the Service server system</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>Interfering with or disrupting the access of any user, host or network</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>Abusing or submitting excessive requests to the Service via it's API</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Pocket Brilliance Limited will determine any abuse or misuse \t\t\t\t\r\n");
      out.write("\t\t\tof our Service</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Premium Subscription Service and Payment </h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">You may choose our free Service or paid subscription Service \t\t\t\t\r\n");
      out.write("\t\t\twhich automatically renews at the end of your billing period. You can upgrade from \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfree Service to Premium at any time.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">All prices shown when upgrading to our paid subscription \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tService are inclusive of any applicable sales taxes, levies, value-added taxes, or \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tduties imposed by taxing authorities, and you are responsible for the \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tforwarding/remittance of all such taxes, levies, or duties (except for E.U. \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tCustomers, where the Euro pricing includes mandatory E.U. VAT charges).</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">By purchasing our premium Service you agree to our refund \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tpolicy. You can cancel your payment at any time, but we can only issue refunds for \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trequests that occur within 48 hours of the date shown on your payment bill. Your \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tPremium (Paid) Account will remain active until cancellation or termination under \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tthese Terms. Failing to pay for your Premium (Paid) Account on time might result in \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tloss of access to features you have paid for. We may change the fees in effect at a \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfuture date, but we will send advanced notice of any changes to the email address \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tassociated with your account.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">For premium purchases made through Google PlayStore, please \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trefer to Google's support page for instructions: \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"https://support.google.com/googleplay/answer/2479637\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trequest a refund on Google</a></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">Limited Liability for Our Service</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">To the maximum extent permitted by law, the Service is \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tavailable \"as is\". By using our Service you understand and agree to that.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">When permitted by law, Pocket Brilliance Limited and it's   \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tservice partners, licensors, employees, agents will not be responsible for any lost \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tprofits, revenue, or data, finacial losses or indirect special, consequential, \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\texemplary, or punitive damages under any circumstances.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Your use and/or purchase of our Service are all at your sole \t\t\t\t\r\n");
      out.write("\t\t\trisk.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">Pocket Brilliance Limited does not warrant that:</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<ul class=\"part-list\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>The Service will meet all of your requirements at all times.</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>The Service will be error free and all errors in the Service will be \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcorrected.</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>The Service will be uninterrupted.</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">All content downloaded, uploaded and/or otherwise obtained \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tthrough the use of the Service is done at you own risk and you are solely \t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tresponsible for any damage to your equipment.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 class=\"sub-title\">How to contact us</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"text-content\">I try to be as transparent as possible. However, If you have \t\t\t\t\r\n");
      out.write("\t\t\tany questions about the Terms of Service, please just email me. Cheers, Steve</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"quote\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<q>Privacy is not an option, and it shouldn't be the price we accept for just \t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tgetting on the internet</q>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t- Gary Kovacs\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
      out.write("<footer class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"foot\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"foot-title\">Company</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"/contact\">Contact Us</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"/about\">About Our App</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"foot\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"foot-title\">Legal</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"/terms_of_service\">Terms of Service</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"/privacy_policy\">Privacy Policy</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"foot\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"foot-title\">Tools</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"/how_to_use\">How To Use Our Service?</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"copyright\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t@ 2022 - 2023 \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#\">Just Do It</a> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t- Todo List App Version 1.0\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/static_pages/../includes/header.jspf(41,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sign_status == \"sign_in\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<a class=\"header-link\" href=\"/sign_up\">Sign Up</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/static_pages/../includes/header.jspf(47,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sign_status == \"sign_up\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<a class=\"header-link\" href=\"/login\">Sign In</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/static_pages/../includes/header.jspf(53,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ user_status == \"loggedin\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<a class=\"header-link\" href=\"/logout\">Logout</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/static_pages/../includes/header.jspf(59,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ user_status == \"loggedout\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
    if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<a class=\"header-link\" href=\"/login\">Sign In</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<a class=\"header-link\" href=\"/logout\">Logout</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
