#!/usr/bin/env ruby
require 'rspec'
require 'selenium-webdriver'

describe 'Selenium Tests' do

  before(:each) do
    @driver = Selenium::WebDriver.for(:firefox)
    @driver.manage.timeouts.implicit_wait = 10
  end
  
  it 'Verify About link functionality' do
    @driver.get "http://nibbler.silktide.com/"
    @driver.find_element(:link, 'About').click
    headerText = @driver.find_element(:class, 'contentheader').text
    expect(headerText).to be == 'About Nibbler'
  end

  after(:each) do
    @driver.quit
  end

end
